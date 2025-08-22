package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PBS_Kids device specifications for Android Compose previews.
 *
 * This extension provides PBS_Kids device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PBSKids.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PBSKids: Any
  get() = object {
      /** PBS_Kids PBS700DVD */
      val PBS700DVD = "spec:width=600,height=1024,unit=px,dpi=160"

  }
