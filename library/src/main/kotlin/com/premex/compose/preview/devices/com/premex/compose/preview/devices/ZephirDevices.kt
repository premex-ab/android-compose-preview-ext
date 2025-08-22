package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Zephir device specifications for Android Compose previews.
 *
 * This extension provides Zephir device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zephir.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zephir: Any
  get() = object {
      /** DeviceSpec(manufacturer=Zephir, code=bangbae, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zephir, code=bangbae, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Zephir, code=komagome, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zephir, code=komagome, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KOMAGOME = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Zephir, code=tamachi, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zephir, code=tamachi, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Zephir, code=yeongdeungpo, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zephir, code=yeongdeungpo,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
