package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ELEMENT device specifications for Android Compose previews.
 *
 * This extension provides ELEMENT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ELEMENT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ELEMENT: Any
  get() = object {
      /** DeviceSpec(manufacturer=ELEMENT, code=hongkong, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ELEMENT, code=hongkong, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ELEMENT, code=khardi, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ELEMENT, code=khardi, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KHARDI = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
