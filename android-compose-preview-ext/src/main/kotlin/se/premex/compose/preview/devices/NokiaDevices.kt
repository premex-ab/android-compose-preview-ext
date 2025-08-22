package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * NOKIA device specifications for Android Compose previews.
 *
 * This extension provides NOKIA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nokia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nokia: Any
  get() = object {
      /** NOKIA mateo */
      val MATEO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** NOKIA R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** NOKIA R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** NOKIA R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
