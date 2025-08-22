package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DreamMaker device specifications for Android Compose previews.
 *
 * This extension provides DreamMaker device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DreamMaker.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DreamMaker: Any
  get() = object {
      /** DeviceSpec(manufacturer=DreamMaker, code=DPLAY, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DreamMaker, code=DPLAY, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val DPLAY = "spec:width=800,height=1280,unit=px,dpi=160"

  }
