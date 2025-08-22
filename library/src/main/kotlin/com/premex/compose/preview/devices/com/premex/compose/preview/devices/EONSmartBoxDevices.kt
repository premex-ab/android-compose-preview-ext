package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EONSmartBox device specifications for Android Compose previews.
 *
 * This extension provides EONSmartBox device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EONSmartBox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EONSmartBox: Any
  get() = object {
      /** DeviceSpec(manufacturer=EONSmartBox, code=CHOTT0102, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EONSmartBox, code=CHOTT0102,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val CHOTT0102 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EONSmartBox, code=CHSTB02, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EONSmartBox, code=CHSTB02,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val CHSTB02 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EONSmartBox, code=KNSTB02, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EONSmartBox, code=KNSTB02,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val KNSTB02 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
