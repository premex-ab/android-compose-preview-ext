package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Tesla device specifications for Android Compose previews.
 *
 * This extension provides Tesla device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tesla.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tesla: Any
  get() = object {
      /** Tesla anaheim */
      val ANAHEIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Tesla Explr_9 */
      val EXPLR_9 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** Tesla guandu */
      val GUANDU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Tesla L6195 */
      val L6195 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Tesla LAS */
      val LAS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Tesla martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Tesla shinagawa */
      val SHINAGAWA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Tesla SW4H */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Tesla SW6H */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Tesla tamachi */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Tesla Tesla_L8_2 */
      val TESLA_L8_2 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Tesla Tesla_SP3_3 */
      val TESLA_SP3_3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Tesla Tesla_SP3_3Lite */
      val TESLA_SP3_3LITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Tesla Tesla_SP3_4 */
      val TESLA_SP3_4 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Tesla Tesla_SP3_5 */
      val TESLA_SP3_5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Tesla Tesla_SP6_3 */
      val TESLA_SP6_3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Tesla Tesla_SP6_4_Lite */
      val TESLA_SP6_4_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Tesla Tesla_SP9_2 */
      val TESLA_SP9_2 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Tesla umeda */
      val UMEDA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Tesla yeongdeungpo */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
