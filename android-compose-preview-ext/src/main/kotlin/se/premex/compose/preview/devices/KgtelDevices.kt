package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * KGTEL device specifications for Android Compose previews.
 *
 * This extension provides KGTEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kgtel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kgtel: Any
  get() = object {
      /** KGTEL A56 */
      val A56 = "spec:width=480,height=960,unit=px,dpi=213"

      /** KGTEL Better10 */
      val BETTER10 = "spec:width=480,height=960,unit=px,dpi=216"

      /** KGTEL Hello_10_Pro_4G */
      val HELLO_10_PRO_4G = "spec:width=720,height=1600,unit=px,dpi=320"

      /** KGTEL Mate20_Pro_4G */
      val MATE20_PRO_4G = "spec:width=720,height=1612,unit=px,dpi=320"

      /** KGTEL Nova_10_Pro_4G */
      val NOVA_10_PRO_4G = "spec:width=720,height=1612,unit=px,dpi=320"

      /** KGTEL R10A */
      val R10A = "spec:width=540,height=960,unit=px,dpi=240"

      /** KGTEL X55E */
      val X55E = "spec:width=480,height=960,unit=px,dpi=213"

      /** KGTEL X5A */
      val X5A = "spec:width=540,height=960,unit=px,dpi=240"

  }
