package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PHILIPS device specifications for Android Compose previews.
 *
 * This extension provides PHILIPS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PHILIPS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PHILIPS: Any
  get() = object {
      /** PHILIPS GMP */
      val GMP = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** PHILIPS hongkong */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** PHILIPS khardi */
      val KHARDI = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** PHILIPS lavender */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** PHILIPS mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** PHILIPS MT5593Uplus */
      val MT5593UPLUS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** PHILIPS philips_MT5593FHT_EU */
      val PHILIPS_MT5593FHT_EU = "spec:width=720,height=1280,unit=px,dpi=213"

      /** PHILIPS philips_MT5593HT_LT */
      val PHILIPS_MT5593HT_LT = "spec:width=720,height=1280,unit=px,dpi=213"

      /** PHILIPS PHILIPS-S6210 */
      val PHILIPS_S6210 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** PHILIPS PHILIPS-S6211 */
      val PHILIPS_S6211 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** PHILIPS PHILIPS-S6310 */
      val PHILIPS_S6310 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** PHILIPS PHILIPS-S6311 */
      val PHILIPS_S6311 = "spec:width=720,height=1600,unit=px,dpi=480"

      /** PHILIPS PHILIPS-S7710 */
      val PHILIPS_S7710 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** PHILIPS PI3100_98 */
      val PI3100_98 = "spec:width=600,height=976,unit=px,dpi=160"

      /** PHILIPS QM16XE_F */
      val QM16XE_F = "spec:width=720,height=1280,unit=px,dpi=213"

      /** PHILIPS QM16XE_U */
      val QM16XE_U = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** PHILIPS QM16XE_UB */
      val QM16XE_UB = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** PHILIPS QV151E */
      val QV151E = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** PHILIPS TLE722G */
      val TLE722G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** PHILIPS whitefield */
      val WHITEFIELD = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
