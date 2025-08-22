package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FandU device specifications for Android Compose previews.
 *
 * This extension provides FandU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FandU.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FandU: Any
  get() = object {
      /** DeviceSpec(manufacturer=FandU, code=marina, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FandU, code=marina, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FandU, code=nagata, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FandU, code=nagata, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NAGATA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=FandU, code=tamachi, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FandU, code=tamachi, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=FandU, code=yeongdeungpo, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FandU, code=yeongdeungpo,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
