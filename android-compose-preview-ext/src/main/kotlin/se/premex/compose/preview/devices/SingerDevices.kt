package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SINGER device specifications for Android Compose previews.
 *
 * This extension provides SINGER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Singer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Singer: Any
  get() = object {
      /** SINGER R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SINGER R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SINGER R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SINGER R3_GTV */
      val R3_GTV = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SINGER R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SINGER R4_GTV */
      val R4_GTV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SINGER sunnyvale */
      val SUNNYVALE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SINGER SW4H */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SINGER SW6H */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=160"

  }
