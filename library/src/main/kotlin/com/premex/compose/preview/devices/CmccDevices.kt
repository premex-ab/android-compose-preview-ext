package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CMCC device specifications for Android Compose previews.
 *
 * This extension provides CMCC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cmcc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cmcc: Any
  get() = object {
      /** CMCC M651G */
      val M651G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** CMCC M762G */
      val M762G = "spec:width=720,height=1500,unit=px,dpi=320"

      /** CMCC m823_cmcc */
      val M823_CMCC = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
