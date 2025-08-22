package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KanDao device specifications for Android Compose previews.
 *
 * This extension provides KanDao device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KanDao.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KanDao: Any
  get() = object {
      /** KanDao MT1001 */
      val MT1001 = "spec:width=1080,height=1920,unit=px,dpi=240"

  }
