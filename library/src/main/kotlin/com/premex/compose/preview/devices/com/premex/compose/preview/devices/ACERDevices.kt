package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ACER device specifications for Android Compose previews.
 *
 * This extension provides ACER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ACER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ACER: Any
  get() = object {
      /** DeviceSpec(manufacturer=ACER, code=Acer_A60L, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACER, code=Acer_A60L, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ACER_A60L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACER, code=AKMEI14, width=2160, height=3840, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACER, code=AKMEI14, width=2160,
      height=3840, dpi=420, isGoogleDevice=false).code */
      val AKMEI14 = "spec:width=2160,height=3840,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=ACER, code=anglelake, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACER, code=anglelake, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ANGLELAKE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ACER, code=ARSP25MTA14A1, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACER, code=ARSP25MTA14A1,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val ARSP25MTA14A1 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ACER, code=AS10W, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACER, code=AS10W, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val AS10W = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=ACER, code=AS8W, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACER, code=AS8W, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val AS8W = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ACER, code=chester, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACER, code=chester, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val CHESTER = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACER, code=dahu, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACER, code=dahu, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DAHU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACER, code=R1, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACER, code=R1, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ACER, code=R10G, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACER, code=R10G, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val R10G = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACER, code=R2, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACER, code=R2, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACER, code=R3, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACER, code=R3, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ACER, code=R3_GTV, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACER, code=R3_GTV, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R3_GTV = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ACER, code=R4, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACER, code=R4, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACER, code=R4_GTV, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACER, code=R4_GTV, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R4_GTV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACER, code=vileparle, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACER, code=vileparle, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val VILEPARLE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACER, code=waiawa, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACER, code=waiawa, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val WAIAWA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
