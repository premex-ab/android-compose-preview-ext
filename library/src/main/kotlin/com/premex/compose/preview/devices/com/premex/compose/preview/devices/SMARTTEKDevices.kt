package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SMART_TEK device specifications for Android Compose previews.
 *
 * This extension provides SMART_TEK device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SMARTTEK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SMARTTEK: Any
  get() = object {
      /** DeviceSpec(manufacturer=SMART_TEK, code=MR_POTATO_HEAD, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMART_TEK, code=MR_POTATO_HEAD,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val MR_POTATO_HEAD = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SMART_TEK, code=PLAY_DOH, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMART_TEK, code=PLAY_DOH,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val PLAY_DOH = "spec:width=600,height=1024,unit=px,dpi=160"

  }
