package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GOL device specifications for Android Compose previews.
 *
 * This extension provides GOL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GOL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GOL: Any
  get() = object {
      /** GOL F10 */
      val F10 = "spec:width=480,height=960,unit=px,dpi=213"

      /** GOL F10_PRIME */
      val F10_PRIME = "spec:width=480,height=960,unit=px,dpi=240"

      /** GOL F11 */
      val F11 = "spec:width=480,height=960,unit=px,dpi=213"

      /** GOL F9 */
      val F9 = "spec:width=480,height=960,unit=px,dpi=213"

      /** GOL F9prime */
      val F9PRIME = "spec:width=480,height=854,unit=px,dpi=200"

      /** GOL Team_7_Plus */
      val TEAM_7_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

  }
