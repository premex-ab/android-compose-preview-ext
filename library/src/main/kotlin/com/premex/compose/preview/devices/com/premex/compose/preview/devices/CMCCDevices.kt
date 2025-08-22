package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CMCC device specifications for Android Compose previews.
 *
 * This extension provides CMCC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CMCC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CMCC: Any
  get() = object {
      /** DeviceSpec(manufacturer=CMCC, code=M651G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CMCC, code=M651G, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val M651G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CMCC, code=M762G, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CMCC, code=M762G, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val M762G = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CMCC, code=m823_cmcc, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CMCC, code=m823_cmcc, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val M823_CMCC = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
