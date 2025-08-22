package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iCraig device specifications for Android Compose previews.
 *
 * This extension provides iCraig device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ICraig.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ICraig: Any
  get() = object {
      /** iCraig CMP838 */
      val CMP838 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** iCraig CMP840 */
      val CMP840 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
