package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * eSTAR device specifications for Android Compose previews.
 *
 * This extension provides eSTAR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ESTAR.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ESTAR: Any
  get() = object {
      /** DeviceSpec(manufacturer=eSTAR, code=Digni-Smart, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=eSTAR, code=Digni-Smart, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val DIGNI_SMART = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=eSTAR, code=martin, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=eSTAR, code=martin, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=eSTAR, code=MID1020L, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=eSTAR, code=MID1020L, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val MID1020L = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=eSTAR, code=MID7388, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=eSTAR, code=MID7388, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MID7388 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=eSTAR, code=MID7399, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=eSTAR, code=MID7399, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MID7399 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=eSTAR, code=tamachi, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=eSTAR, code=tamachi, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=eSTAR, code=yeongdeungpo, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=eSTAR, code=yeongdeungpo,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
