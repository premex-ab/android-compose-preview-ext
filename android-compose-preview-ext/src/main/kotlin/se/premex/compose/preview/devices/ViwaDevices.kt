package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * VIWA device specifications for Android Compose previews.
 *
 * This extension provides VIWA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Viwa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Viwa: Any
  get() = object {
      /** VIWA VIWA_LIGHT_ONE */
      val VIWA_LIGHT_ONE = "spec:width=480,height=854,unit=px,dpi=240"

      /** VIWA VIWA_LIGHT_PLUS */
      val VIWA_LIGHT_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** VIWA VIWA_V10 */
      val VIWA_V10 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
