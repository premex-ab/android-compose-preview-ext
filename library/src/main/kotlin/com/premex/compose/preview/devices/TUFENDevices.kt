package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TUFEN device specifications for Android Compose previews.
 *
 * This extension provides TUFEN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TUFEN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TUFEN: Any
  get() = object {
      /** TUFEN Q718B_EEA */
      val Q718B_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TUFEN Q738 */
      val Q738 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TUFEN Q88C */
      val Q88C = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TUFEN Q88D_FUFEN_EEA */
      val Q88D_FUFEN_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

  }
