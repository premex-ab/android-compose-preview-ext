package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CIUSE_SRL device specifications for Android Compose previews.
 *
 * This extension provides CIUSE_SRL device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CIUSESRL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CIUSESRL: Any
  get() = object {
      /** CIUSE_SRL CAB_TAB */
      val CAB_TAB = "spec:width=600,height=1024,unit=px,dpi=213"

  }
