package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MTS device specifications for Android Compose previews.
 *
 * This extension provides MTS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MTS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MTS: Any
  get() = object {
      /** DeviceSpec(manufacturer=MTS, code=B866_MTS_IPTV, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MTS, code=B866_MTS_IPTV,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val B866_MTS_IPTV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MTS, code=B866_MTS_OTT, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MTS, code=B866_MTS_OTT, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val B866_MTS_OTT = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MTS, code=DV8304C, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MTS, code=DV8304C, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8304C = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MTS, code=DV9135-KRM, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MTS, code=DV9135-KRM, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DV9135_KRM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MTS, code=DV9157-C-KRM, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MTS, code=DV9157-C-KRM, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DV9157_C_KRM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
