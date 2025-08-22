package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * OSCAL device specifications for Android Compose previews.
 *
 * This extension provides OSCAL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Oscal.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Oscal: Any
  get() = object {
      /** OSCAL C20 */
      val C20 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** OSCAL C20_Pro */
      val C20_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** OSCAL C30 */
      val C30 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** OSCAL C30_Pro */
      val C30_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** OSCAL C60 */
      val C60 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** OSCAL C70 */
      val C70 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** OSCAL C80 */
      val C80 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** OSCAL ELITE_1 */
      val ELITE_1 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** OSCAL FLAT1C */
      val FLAT1C = "spec:width=720,height=1600,unit=px,dpi=320"

      /** OSCAL FLAT_2 */
      val FLAT_2 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** OSCAL FLAT_2C */
      val FLAT_2C = "spec:width=720,height=1612,unit=px,dpi=320"

      /** OSCAL MARINE_1 */
      val MARINE_1 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** OSCAL MARINE_2 */
      val MARINE_2 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** OSCAL MODERN_8 */
      val MODERN_8 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** OSCAL Pad13_EEA */
      val PAD13_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** OSCAL Pad13_NEU */
      val PAD13_NEU = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** OSCAL Pad15 */
      val PAD15 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** OSCAL Pad15_EEA */
      val PAD15_EEA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** OSCAL Pad15_RU */
      val PAD15_RU = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** OSCAL Pad16 */
      val PAD16 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** OSCAL Pad18 */
      val PAD18 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** OSCAL Pad60_EEA */
      val PAD60_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** OSCAL Pad60_NEU */
      val PAD60_NEU = "spec:width=800,height=1280,unit=px,dpi=213"

      /** OSCAL Pad70_NEU */
      val PAD70_NEU = "spec:width=800,height=1280,unit=px,dpi=213"

      /** OSCAL Pad_100 */
      val PAD_100 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** OSCAL Pad_10_EEA */
      val PAD_10_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** OSCAL Pad_10_NEU */
      val PAD_10_NEU = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** OSCAL Pad_10_RU */
      val PAD_10_RU = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** OSCAL Pad_5 */
      val PAD_5 = "spec:width=800,height=1340,unit=px,dpi=213"

      /** OSCAL Pad_50_Kids */
      val PAD_50_KIDS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** OSCAL Pad_50_WiFi */
      val PAD_50_WIFI = "spec:width=800,height=1280,unit=px,dpi=160"

      /** OSCAL Pad_5_Kids */
      val PAD_5_KIDS = "spec:width=800,height=1340,unit=px,dpi=213"

      /** OSCAL Pad_60_Kids */
      val PAD_60_KIDS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** OSCAL Pad_7 */
      val PAD_7 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** OSCAL Pad_70_WiFi */
      val PAD_70_WIFI = "spec:width=800,height=1280,unit=px,dpi=220"

      /** OSCAL Pad_80_WiFi */
      val PAD_80_WIFI = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** OSCAL Pad_9 */
      val PAD_9 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** OSCAL Pad_90 */
      val PAD_90 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** OSCAL PILOT_1 */
      val PILOT_1 = "spec:width=720,height=1604,unit=px,dpi=320"

      /** OSCAL PILOT_2 */
      val PILOT_2 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** OSCAL S60 */
      val S60 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** OSCAL S60Pro */
      val S60PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** OSCAL S70 */
      val S70 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** OSCAL S70_Pro */
      val S70_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** OSCAL S80 */
      val S80 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** OSCAL Spider8 */
      val SPIDER8 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** OSCAL Tiger10 */
      val TIGER10 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** OSCAL Tiger12 */
      val TIGER12 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** OSCAL TIGER_13 */
      val TIGER_13 = "spec:width=720,height=1604,unit=px,dpi=320"

  }
