package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * uLesson device specifications for Android Compose previews.
 *
 * This extension provides uLesson device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ulesson.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ulesson: Any
  get() = object {
      /** uLesson uLesson_Education_Tab */
      val ULESSON_EDUCATION_TAB = "spec:width=800,height=1280,unit=px,dpi=213"

      /** uLesson uLesson_Tab_V2 */
      val ULESSON_TAB_V2 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
