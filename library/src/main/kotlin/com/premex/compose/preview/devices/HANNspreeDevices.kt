package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HANNspree device specifications for Android Compose previews.
 *
 * This extension provides HANNspree device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HANNspree.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HANNspree: Any
  get() = object {
      /** HANNspree HSG1351 */
      val HSG1351 = "spec:width=1080,height=1920,unit=px,dpi=213"

      /** HANNspree HSG1416A */
      val HSG1416A = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** HANNspree Reader */
      val READER = "spec:width=1200,height=1600,unit=px,dpi=213"

  }
