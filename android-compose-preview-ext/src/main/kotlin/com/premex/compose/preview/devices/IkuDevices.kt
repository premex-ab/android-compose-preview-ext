package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iku device specifications for Android Compose previews.
 *
 * This extension provides iku device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Iku.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Iku: Any
  get() = object {
      /** iku A25 */
      val A25 = "spec:width=480,height=960,unit=px,dpi=220"

      /** iku K5 */
      val K5 = "spec:width=480,height=960,unit=px,dpi=240"

      /** iku Note_10 */
      val NOTE_10 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
