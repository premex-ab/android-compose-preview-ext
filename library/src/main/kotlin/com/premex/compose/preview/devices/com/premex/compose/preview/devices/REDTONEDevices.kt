package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * REDTONE device specifications for Android Compose previews.
 *
 * This extension provides REDTONE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.REDTONE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.REDTONE: Any
  get() = object {
      /** DeviceSpec(manufacturer=REDTONE, code=RTSP-A124ML, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=REDTONE, code=RTSP-A124ML,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val RTSP_A124ML = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=REDTONE, code=RTSP-A258HM, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=REDTONE, code=RTSP-A258HM,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val RTSP_A258HM = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=REDTONE, code=RTSP-A64B, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=REDTONE, code=RTSP-A64B, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val RTSP_A64B = "spec:width=720,height=1600,unit=px,dpi=320"

  }
