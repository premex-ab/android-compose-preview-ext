package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MAG device specifications for Android Compose previews.
 *
 * This extension provides MAG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MAG.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MAG: Any
  get() = object {
      /** DeviceSpec(manufacturer=MAG, code=lavender, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAG, code=lavender, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MAG, code=MAG425A, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAG, code=MAG425A, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MAG425A = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MAG, code=MAG500A, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAG, code=MAG500A, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val MAG500A = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MAG, code=YHT, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAG, code=YHT, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val YHT = "spec:width=720,height=1280,unit=px,dpi=320"

  }
