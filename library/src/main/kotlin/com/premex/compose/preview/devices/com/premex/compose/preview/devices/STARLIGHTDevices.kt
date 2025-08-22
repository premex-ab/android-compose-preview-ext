package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * STARLIGHT device specifications for Android Compose previews.
 *
 * This extension provides STARLIGHT device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.STARLIGHT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.STARLIGHT: Any
  get() = object {
      /** DeviceSpec(manufacturer=STARLIGHT, code=tamachi, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STARLIGHT, code=tamachi, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=STARLIGHT, code=VENUS_PLUS, width=442, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STARLIGHT, code=VENUS_PLUS,
      width=442, height=960, dpi=240, isGoogleDevice=false).code */
      val VENUS_PLUS = "spec:width=442,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STARLIGHT, code=yeongdeungpo, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STARLIGHT, code=yeongdeungpo,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
