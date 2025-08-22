package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OneLern device specifications for Android Compose previews.
 *
 * This extension provides OneLern device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OneLern.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OneLern: Any
  get() = object {
      /** OneLern OneLernDB009 */
      val ONELERNDB009 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** OneLern OneLernDB010 */
      val ONELERNDB010 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
