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
      /** DeviceSpec(manufacturer=PHILIPS, code=GMP, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILIPS, code=GMP, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val GMP = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PHILIPS, code=hongkong, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILIPS, code=hongkong, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PHILIPS, code=khardi, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILIPS, code=khardi, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KHARDI = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PHILIPS, code=lavender, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILIPS, code=lavender, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PHILIPS, code=mountbaker, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILIPS, code=mountbaker,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PHILIPS, code=MT5593Uplus, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILIPS, code=MT5593Uplus,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val MT5593UPLUS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PHILIPS, code=philips_MT5593FHT_EU, width=720, height=1280,
      dpi=213, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILIPS,
      code=philips_MT5593FHT_EU, width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val PHILIPS_MT5593FHT_EU = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PHILIPS, code=philips_MT5593HT_LT, width=720, height=1280,
      dpi=213, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILIPS,
      code=philips_MT5593HT_LT, width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val PHILIPS_MT5593HT_LT = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PHILIPS, code=PHILIPS-S6210, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILIPS, code=PHILIPS-S6210,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val PHILIPS_S6210 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PHILIPS, code=PHILIPS-S6211, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILIPS, code=PHILIPS-S6211,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val PHILIPS_S6211 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PHILIPS, code=PHILIPS-S6310, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILIPS, code=PHILIPS-S6310,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val PHILIPS_S6310 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PHILIPS, code=PHILIPS-S6311, width=720, height=1600, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILIPS, code=PHILIPS-S6311,
      width=720, height=1600, dpi=480, isGoogleDevice=false).code */
      val PHILIPS_S6311 = "spec:width=720,height=1600,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=PHILIPS, code=PHILIPS-S7710, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILIPS, code=PHILIPS-S7710,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val PHILIPS_S7710 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PHILIPS, code=PI3100_98, width=600, height=976, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILIPS, code=PI3100_98, width=600,
      height=976, dpi=160, isGoogleDevice=false).code */
      val PI3100_98 = "spec:width=600,height=976,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PHILIPS, code=QM16XE_F, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILIPS, code=QM16XE_F, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val QM16XE_F = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PHILIPS, code=QM16XE_U, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILIPS, code=QM16XE_U, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val QM16XE_U = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PHILIPS, code=QM16XE_UB, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILIPS, code=QM16XE_UB,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val QM16XE_UB = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PHILIPS, code=QV151E, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILIPS, code=QV151E, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val QV151E = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PHILIPS, code=TLE722G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILIPS, code=TLE722G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TLE722G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PHILIPS, code=whitefield, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHILIPS, code=whitefield,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val WHITEFIELD = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
