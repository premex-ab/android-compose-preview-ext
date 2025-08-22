package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CMDC device specifications for Android Compose previews.
 *
 * This extension provides CMDC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CMDC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CMDC: Any
  get() = object {
      /** CMDC HS8916QC */
      val HS8916QC = "spec:width=720,height=1280,unit=px,dpi=320"

  }
