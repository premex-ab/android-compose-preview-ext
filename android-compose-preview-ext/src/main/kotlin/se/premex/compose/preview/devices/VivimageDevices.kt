package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * VIVIMAGE device specifications for Android Compose previews.
 *
 * This extension provides VIVIMAGE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vivimage.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vivimage: Any
  get() = object {
      /** VIVIMAGE E10 */
      val E10 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** VIVIMAGE E11 */
      val E11 = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** VIVIMAGE E8 */
      val E8 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** VIVIMAGE VIVIMAGE_A10 */
      val VIVIMAGE_A10 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** VIVIMAGE VIVIMAGE_A10_EEA */
      val VIVIMAGE_A10_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

  }
