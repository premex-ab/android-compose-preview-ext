package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TIGERS device specifications for Android Compose previews.
 *
 * This extension provides TIGERS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TIGERS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TIGERS: Any
  get() = object {
      /** TIGERS TIS001-S3 */
      val TIS001_S3 = "spec:width=480,height=960,unit=px,dpi=240"

      /** TIGERS TIS001_S4 */
      val TIS001_S4 = "spec:width=480,height=960,unit=px,dpi=220"

  }
