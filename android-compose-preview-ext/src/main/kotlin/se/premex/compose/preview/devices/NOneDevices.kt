package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * N-one device specifications for Android Compose previews.
 *
 * This extension provides N-one device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NOne.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NOne: Any
  get() = object {
      /** N-one NpadAir */
      val NPADAIR = "spec:width=800,height=1280,unit=px,dpi=210"

      /** N-one Npadplus */
      val NPADPLUS = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** N-one NpadQ */
      val NPADQ = "spec:width=800,height=1280,unit=px,dpi=160"

      /** N-one NpadS */
      val NPADS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** N-one NpadY */
      val NPADY = "spec:width=800,height=1280,unit=px,dpi=160"

      /** N-one NpadY1 */
      val NPADY1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** N-one Npad_ultra */
      val NPAD_ULTRA = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** N-one TAB005 */
      val TAB005 = "spec:width=1200,height=2000,unit=px,dpi=213"

  }
