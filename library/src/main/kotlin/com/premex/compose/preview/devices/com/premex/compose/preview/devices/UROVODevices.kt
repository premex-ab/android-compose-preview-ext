package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UROVO device specifications for Android Compose previews.
 *
 * This extension provides UROVO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.UROVO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.UROVO: Any
  get() = object {
      /** DeviceSpec(manufacturer=UROVO, code=DT50_5G, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UROVO, code=DT50_5G, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val DT50_5G = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UROVO, code=DT66, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UROVO, code=DT66, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val DT66 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=UROVO, code=SQ57, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UROVO, code=SQ57, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SQ57 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
