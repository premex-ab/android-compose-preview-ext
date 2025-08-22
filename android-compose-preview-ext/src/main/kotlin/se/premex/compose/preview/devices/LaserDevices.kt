package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Laser device specifications for Android Compose previews.
 *
 * This extension provides Laser device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Laser.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Laser: Any
  get() = object {
      /** Laser MID-1085A100 */
      val MID_1085A100 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Laser MID_1087V9 */
      val MID_1087V9 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Laser MID_1089IPS */
      val MID_1089IPS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Laser MID_1089IPSA100 */
      val MID_1089IPSA100 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Laser MID_1090IPSV9 */
      val MID_1090IPSV9 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Laser MID-785A100 */
      val MID_785A100 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Laser MID_789A100 */
      val MID_789A100 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
