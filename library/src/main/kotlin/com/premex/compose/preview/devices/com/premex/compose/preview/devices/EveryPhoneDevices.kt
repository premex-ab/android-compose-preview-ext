package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EveryPhone device specifications for Android Compose previews.
 *
 * This extension provides EveryPhone device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EveryPhone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EveryPhone: Any
  get() = object {
      /** DeviceSpec(manufacturer=EveryPhone, code=EP172BZ, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EveryPhone, code=EP172BZ,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val EP172BZ = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EveryPhone, code=EP172PR, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EveryPhone, code=EP172PR,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val EP172PR = "spec:width=720,height=1280,unit=px,dpi=320"

  }
