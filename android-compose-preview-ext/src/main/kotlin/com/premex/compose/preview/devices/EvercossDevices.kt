package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EVERCOSS device specifications for Android Compose previews.
 *
 * This extension provides EVERCOSS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Evercoss.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Evercoss: Any
  get() = object {
      /** EVERCOSS AT8B */
      val AT8B = "spec:width=768,height=1024,unit=px,dpi=240"

      /** EVERCOSS EVERCOSS_A75B */
      val EVERCOSS_A75B = "spec:width=480,height=854,unit=px,dpi=240"

      /** EVERCOSS EVERCOSS_M40A */
      val EVERCOSS_M40A = "spec:width=480,height=800,unit=px,dpi=240"

      /** EVERCOSS EVERCOSS_M50_MAX */
      val EVERCOSS_M50_MAX = "spec:width=480,height=854,unit=px,dpi=240"

      /** EVERCOSS EVERCOSS_M50_STAR */
      val EVERCOSS_M50_STAR = "spec:width=480,height=854,unit=px,dpi=240"

      /** EVERCOSS EVERCOSS_M80 */
      val EVERCOSS_M80 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** EVERCOSS EVERCOSS_S45 */
      val EVERCOSS_S45 = "spec:width=480,height=854,unit=px,dpi=240"

      /** EVERCOSS EVERCOSS_S50 */
      val EVERCOSS_S50 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** EVERCOSS EVERCOSS_U6 */
      val EVERCOSS_U6 = "spec:width=480,height=960,unit=px,dpi=240"

      /** EVERCOSS EVERCOSS_U60 */
      val EVERCOSS_U60 = "spec:width=480,height=960,unit=px,dpi=240"

      /** EVERCOSS EVERCOSS_U6_PRIME */
      val EVERCOSS_U6_PRIME = "spec:width=720,height=1440,unit=px,dpi=320"

      /** EVERCOSS M53 */
      val M53 = "spec:width=480,height=960,unit=px,dpi=240"

      /** EVERCOSS M55 */
      val M55 = "spec:width=480,height=960,unit=px,dpi=240"

      /** EVERCOSS M55A */
      val M55A = "spec:width=480,height=960,unit=px,dpi=240"

      /** EVERCOSS M55B */
      val M55B = "spec:width=480,height=960,unit=px,dpi=240"

      /** EVERCOSS M55C */
      val M55C = "spec:width=480,height=960,unit=px,dpi=240"

      /** EVERCOSS M6 */
      val M6 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** EVERCOSS M60 */
      val M60 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** EVERCOSS M6A */
      val M6A = "spec:width=600,height=1280,unit=px,dpi=280"

      /** EVERCOSS M70 */
      val M70 = "spec:width=600,height=1024,unit=px,dpi=240"

      /** EVERCOSS R50A */
      val R50A = "spec:width=480,height=854,unit=px,dpi=240"

      /** EVERCOSS R6 */
      val R6 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** EVERCOSS R70 */
      val R70 = "spec:width=600,height=1024,unit=px,dpi=240"

      /** EVERCOSS S45B */
      val S45B = "spec:width=480,height=854,unit=px,dpi=240"

      /** EVERCOSS S55A */
      val S55A = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** EVERCOSS S55B */
      val S55B = "spec:width=720,height=1280,unit=px,dpi=320"

      /** EVERCOSS S6 */
      val S6 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** EVERCOSS U50A */
      val U50A = "spec:width=480,height=854,unit=px,dpi=240"

      /** EVERCOSS U50A_MAX */
      val U50A_MAX = "spec:width=720,height=1280,unit=px,dpi=320"

      /** EVERCOSS U50A_PLUS */
      val U50A_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** EVERCOSS U50C */
      val U50C = "spec:width=720,height=1280,unit=px,dpi=320"

      /** EVERCOSS U55 */
      val U55 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** EVERCOSS U6B */
      val U6B = "spec:width=540,height=1132,unit=px,dpi=240"

      /** EVERCOSS U6C */
      val U6C = "spec:width=600,height=1280,unit=px,dpi=280"

      /** EVERCOSS U70B */
      val U70B = "spec:width=600,height=1024,unit=px,dpi=213"

      /** EVERCOSS U70C */
      val U70C = "spec:width=600,height=1024,unit=px,dpi=240"

      /** EVERCOSS X7 */
      val X7 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** EVERCOSS X9 */
      val X9 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
