package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * mbs device specifications for Android Compose previews.
 *
 * This extension provides mbs device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mbs.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mbs: Any
  get() = object {
      /** DeviceSpec(manufacturer=mbs, code=bluefish, width=416, height=416, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mbs, code=bluefish, width=416,
      height=416, dpi=320, isGoogleDevice=false).code */
      val BLUEFISH = "spec:width=416,height=416,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=mbs, code=coralia, width=416, height=416, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mbs, code=coralia, width=416,
      height=416, dpi=320, isGoogleDevice=false).code */
      val CORALIA = "spec:width=416,height=416,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=mbs, code=icefish, width=390, height=390, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mbs, code=icefish, width=390,
      height=390, dpi=320, isGoogleDevice=false).code */
      val ICEFISH = "spec:width=390,height=390,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=mbs, code=lionfish, width=400, height=400, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mbs, code=lionfish, width=400,
      height=400, dpi=280, isGoogleDevice=false).code */
      val LIONFISH = "spec:width=400,height=400,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=mbs, code=triton, width=390, height=390, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mbs, code=triton, width=390,
      height=390, dpi=320, isGoogleDevice=false).code */
      val TRITON = "spec:width=390,height=390,unit=px,dpi=320"

  }
