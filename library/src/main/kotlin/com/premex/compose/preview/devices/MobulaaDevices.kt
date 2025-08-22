package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MOBULAA device specifications for Android Compose previews.
 *
 * This extension provides MOBULAA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mobulaa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mobulaa: Any
  get() = object {
      /** MOBULAA NOTE2 */
      val NOTE2 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** MOBULAA Note4 */
      val NOTE4 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** MOBULAA S11 */
      val S11 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** MOBULAA Tab-1 */
      val TAB_1 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
