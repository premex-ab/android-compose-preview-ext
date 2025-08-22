package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WiseTech device specifications for Android Compose previews.
 *
 * This extension provides WiseTech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wisetech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wisetech: Any
  get() = object {
      /** WiseTech WiseTech_Note_10 */
      val WISETECH_NOTE_10 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** WiseTech WiseTech_Note_12 */
      val WISETECH_NOTE_12 = "spec:width=720,height=1640,unit=px,dpi=320"

  }
