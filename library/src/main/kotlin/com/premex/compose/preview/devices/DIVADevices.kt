package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DIVA device specifications for Android Compose previews.
 *
 * This extension provides DIVA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DIVA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DIVA: Any
  get() = object {
      /** DIVA T10K_Plus */
      val T10K_PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DIVA T7K_PLUS_SE3_EEA */
      val T7K_PLUS_SE3_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

  }
