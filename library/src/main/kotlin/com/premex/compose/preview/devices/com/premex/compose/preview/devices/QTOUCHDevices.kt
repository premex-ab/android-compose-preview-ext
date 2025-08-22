package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * QTOUCH device specifications for Android Compose previews.
 *
 * This extension provides QTOUCH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.QTOUCH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.QTOUCH: Any
  get() = object {
      /** DeviceSpec(manufacturer=QTOUCH, code=Q524, width=480, height=854, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QTOUCH, code=Q524, width=480,
      height=854, dpi=180, isGoogleDevice=false).code */
      val Q524 = "spec:width=480,height=854,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=QTOUCH, code=Q624, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QTOUCH, code=Q624, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val Q624 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=QTOUCH, code=Q624H, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QTOUCH, code=Q624H, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val Q624H = "spec:width=720,height=1612,unit=px,dpi=320"

  }
