package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Dish device specifications for Android Compose previews.
 *
 * This extension provides Dish device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dish.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dish: Any
  get() = object {
      /** DeviceSpec(manufacturer=Dish, code=dish_cable_bcm, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dish, code=dish_cable_bcm,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val DISH_CABLE_BCM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Dish, code=DSH98123, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dish, code=DSH98123, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val DSH98123 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Dish, code=SL104D, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dish, code=SL104D, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val SL104D = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Dish, code=SL201D, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dish, code=SL201D, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val SL201D = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Dish, code=SN339D, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dish, code=SN339D, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val SN339D = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Dish, code=SN339D-SMT, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dish, code=SN339D-SMT, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val SN339D_SMT = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Dish, code=U653DS, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dish, code=U653DS, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val U653DS = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Dish, code=U695DS, width=1080, height=2460, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dish, code=U695DS, width=1080,
      height=2460, dpi=400, isGoogleDevice=false).code */
      val U695DS = "spec:width=1080,height=2460,unit=px,dpi=400"

  }
