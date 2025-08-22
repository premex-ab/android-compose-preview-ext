package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KAT device specifications for Android Compose previews.
 *
 * This extension provides KAT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kat.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kat: Any
  get() = object {
      /** KAT SM1 */
      val SM1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** KAT SM1_Tablet */
      val SM1_TABLET = "spec:width=800,height=1280,unit=px,dpi=160"

  }
