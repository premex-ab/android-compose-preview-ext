package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * uniqcell device specifications for Android Compose previews.
 *
 * This extension provides uniqcell device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Uniqcell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Uniqcell: Any
  get() = object {
      /** DeviceSpec(manufacturer=uniqcell, code=UNI_GO, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=uniqcell, code=UNI_GO, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val UNI_GO = "spec:width=720,height=1600,unit=px,dpi=320"

  }
