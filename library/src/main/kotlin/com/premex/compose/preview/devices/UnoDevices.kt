package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UNO device specifications for Android Compose previews.
 *
 * This extension provides UNO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Uno.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Uno: Any
  get() = object {
      /** UNO NewPad_10 */
      val NEWPAD_10 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** UNO Premier5 */
      val PREMIER5 = "spec:width=480,height=960,unit=px,dpi=240"

      /** UNO Premier5Max */
      val PREMIER5MAX = "spec:width=480,height=960,unit=px,dpi=200"

      /** UNO Premier_Pro */
      val PREMIER_PRO = "spec:width=480,height=960,unit=px,dpi=213"

      /** UNO Premier_ProA */
      val PREMIER_PROA = "spec:width=480,height=960,unit=px,dpi=213"

      /** UNO Premier_Pro_B */
      val PREMIER_PRO_B = "spec:width=480,height=960,unit=px,dpi=213"

      /** UNO UNO_Prime6 */
      val UNO_PRIME6 = "spec:width=480,height=960,unit=px,dpi=213"

  }
