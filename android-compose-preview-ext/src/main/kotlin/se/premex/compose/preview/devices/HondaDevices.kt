package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Honda device specifications for Android Compose previews.
 *
 * This extension provides Honda device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Honda.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Honda: Any
  get() = object {
      /** Honda msmnile_au */
      val MSMNILE_AU = "spec:width=720,height=1920,unit=px,dpi=160"

      /** Honda vcm30t30 */
      val VCM30T30 = "spec:width=480,height=800,unit=px,dpi=160"

  }
