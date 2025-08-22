package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Admiral device specifications for Android Compose previews.
 *
 * This extension provides Admiral device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Admiral.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Admiral: Any
  get() = object {
      /** DeviceSpec(manufacturer=Admiral, code=anglelake, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Admiral, code=anglelake, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ANGLELAKE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Admiral, code=Fire, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Admiral, code=Fire, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val FIRE = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Admiral, code=One_Mundial, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Admiral, code=One_Mundial,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val ONE_MUNDIAL = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Admiral, code=waiawa, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Admiral, code=waiawa, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val WAIAWA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
