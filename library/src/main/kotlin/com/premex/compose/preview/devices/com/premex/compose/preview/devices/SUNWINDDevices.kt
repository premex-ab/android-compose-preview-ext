package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SUNWIND device specifications for Android Compose previews.
 *
 * This extension provides SUNWIND device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SUNWIND.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SUNWIND: Any
  get() = object {
      /** DeviceSpec(manufacturer=SUNWIND, code=SS1259PG, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNWIND, code=SS1259PG, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SS1259PG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SUNWIND, code=SS1260PG, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNWIND, code=SS1260PG, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SS1260PG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SUNWIND, code=SS1270PL, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNWIND, code=SS1270PL, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SS1270PL = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SUNWIND, code=SS7238PG, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNWIND, code=SS7238PG, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val SS7238PG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SUNWIND, code=SS7265PG, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNWIND, code=SS7265PG, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val SS7265PG = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SUNWIND, code=SS8263PG, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNWIND, code=SS8263PG, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SS8263PG = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SUNWIND, code=SS9236PG, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNWIND, code=SS9236PG, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SS9236PG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SUNWIND, code=SS9237MG, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNWIND, code=SS9237MG, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SS9237MG = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SUNWIND, code=ST7230MG, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNWIND, code=ST7230MG, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val ST7230MG = "spec:width=600,height=1024,unit=px,dpi=160"

  }
