package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GOMOBILE device specifications for Android Compose previews.
 *
 * This extension provides GOMOBILE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GOMOBILE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GOMOBILE: Any
  get() = object {
      /** GOMOBILE G860 */
      val G860 = "spec:width=480,height=960,unit=px,dpi=240"

      /** GOMOBILE GM */
      val GM = "spec:width=600,height=1280,unit=px,dpi=240"

      /** GOMOBILE GO1452 */
      val GO1452 = "spec:width=480,height=854,unit=px,dpi=240"

  }
