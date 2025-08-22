package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Dangbei device specifications for Android Compose previews.
 *
 * This extension provides Dangbei device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dangbei.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dangbei: Any
  get() = object {
      /** DeviceSpec(manufacturer=Dangbei, code=himalaya, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dangbei, code=himalaya, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HIMALAYA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Dangbei, code=khandala, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dangbei, code=khandala, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KHANDALA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
