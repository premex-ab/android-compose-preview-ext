package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HannSpree device specifications for Android Compose previews.
 *
 * This extension provides HannSpree device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HannSpree.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HannSpree: Any
  get() = object {
      /** HannSpree HSG1376_MT8163 */
      val HSG1376_MT8163 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
