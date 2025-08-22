package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OPPO device specifications for Android Compose previews.
 *
 * This extension provides OPPO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Oppo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Oppo: Any
  get() = object {
      /** DeviceSpec(manufacturer=OPPO, code=A11w, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=A11w, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val A11W = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OPPO, code=A1601, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=A1601, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val A1601 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=A1603, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=A1603, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val A1603 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OPPO, code=A31u, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=A31u, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val A31U = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OPPO, code=A33, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=A33, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val A33 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OPPO, code=A33w, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=A33w, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val A33W = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OPPO, code=A37, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=A37, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val A37 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=A37f, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=A37f, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val A37F = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=A51, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=A51, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val A51 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OPPO, code=A53, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=A53, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val A53 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=A57, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=A57, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val A57 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=A59, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=A59, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val A59 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=A73, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=A73, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val A73 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=A73t, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=A73t, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val A73T = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=A77, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=A77, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val A77 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=A79, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=A79, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val A79 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=A79k, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=A79k, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val A79K = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=A79kt, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=A79kt, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val A79KT = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=A79t, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=A79t, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val A79T = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=A83, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=A83, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val A83 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=A83t, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=A83t, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val A83T = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=beluga, width=402, height=476, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=beluga, width=402,
      height=476, dpi=320, isGoogleDevice=false).code */
      val BELUGA = "spec:width=402,height=476,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1605, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1605, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CPH1605 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1607, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1607, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val CPH1607 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1609, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1609, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val CPH1609 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1611, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1611, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val CPH1611 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1613, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1613, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val CPH1613 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1701, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1701, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CPH1701 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1707, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1707, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val CPH1707 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1715, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1715, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val CPH1715 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1717, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1717, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CPH1717 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1719, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1719, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val CPH1719 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1721, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1721, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val CPH1721 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1723, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1723, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val CPH1723 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1725, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1725, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val CPH1725 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1727, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1727, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val CPH1727 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1729, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1729, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val CPH1729 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1801, width=1080, height=2160, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1801, width=1080,
      height=2160, dpi=440, isGoogleDevice=false).code */
      val CPH1801 = "spec:width=1080,height=2160,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1803, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1803, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val CPH1803 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1805, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1805, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val CPH1805 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1809, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1809, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val CPH1809 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1819, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1819, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val CPH1819 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1821, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1821, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val CPH1821 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1823, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1823, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val CPH1823 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1825, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1825, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val CPH1825 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1827, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1827, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val CPH1827 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1831, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1831, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val CPH1831 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1833, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1833, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val CPH1833 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1835, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1835, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val CPH1835 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1837, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1837, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val CPH1837 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1851, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1851, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val CPH1851 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1853, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1853, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val CPH1853 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1859, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1859, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val CPH1859 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1861, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1861, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val CPH1861 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1871, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1871, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val CPH1871 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1875, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1875, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val CPH1875 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1877, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1877, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val CPH1877 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1879, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1879, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val CPH1879 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1881, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1881, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val CPH1881 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1893, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1893, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val CPH1893 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1901, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1901, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val CPH1901 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1903, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1903, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val CPH1903 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1905, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1905, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val CPH1905 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1909, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1909, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val CPH1909 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=CPH1920, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=CPH1920, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val CPH1920 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=F1f, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=F1f, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val F1F = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=N1, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=N1, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val N1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=N1mini, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=N1mini, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val N1MINI = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=N1T, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=N1T, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val N1T = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=N1W, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=N1W, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val N1W = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=N3, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=N3, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val N3 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=N5117, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=N5117, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val N5117 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP4679, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4679, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val OP4679 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4699, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4699, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val OP4699 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP46B1, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP46B1, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val OP46B1 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP46C3, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP46C3, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val OP46C3 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP46F1, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP46F1, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val OP46F1 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP46F3, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP46F3, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val OP46F3 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP47CFL1, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP47CFL1, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val OP47CFL1 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP47DD, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP47DD, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val OP47DD = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP47DDL1, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP47DDL1, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val OP47DDL1 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4845, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4845, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val OP4845 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4845L1, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4845L1, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val OP4845L1 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4847, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4847, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val OP4847 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4847L1, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4847L1, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val OP4847L1 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4863, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4863, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val OP4863 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP486B, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP486B, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val OP486B = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP486C, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP486C, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val OP486C = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP4883, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4883, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val OP4883 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP48A1, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP48A1, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val OP48A1 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP48A1L1, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP48A1L1, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val OP48A1L1 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4A43, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4A43, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val OP4A43 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4A47, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4A47, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4A47 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4A4D, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4A4D, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val OP4A4D = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP4A54, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4A54, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val OP4A54 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP4A57, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4A57, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4A57 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4A77, width=1440, height=3168, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4A77, width=1440,
      height=3168, dpi=640, isGoogleDevice=false).code */
      val OP4A77 = "spec:width=1440,height=3168,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=OPPO, code=OP4A7A, width=1440, height=3168, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4A7A, width=1440,
      height=3168, dpi=640, isGoogleDevice=false).code */
      val OP4A7A = "spec:width=1440,height=3168,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=OPPO, code=OP4A89, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4A89, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4A89 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4A9D, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4A9D, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4A9D = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4AA7, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4AA7, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val OP4AA7 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4AB5, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4AB5, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4AB5 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4ABB, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4ABB, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4ABB = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4ACF, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4ACF, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4ACF = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4AD9, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4AD9, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4AD9 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4ADD, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4ADD, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4ADD = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4AE7, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4AE7, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4AE7 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4AF7, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4AF7, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4AF7 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4B65L1, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4B65L1, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val OP4B65L1 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4B83L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4B83L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4B83L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4B9B, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4B9B, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4B9B = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4B9EL1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4B9EL1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4B9EL1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4BA1L1, width=1440, height=3168, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4BA1L1, width=1440,
      height=3168, dpi=640, isGoogleDevice=false).code */
      val OP4BA1L1 = "spec:width=1440,height=3168,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=OPPO, code=OP4BA2L1, width=1440, height=3168, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4BA2L1, width=1440,
      height=3168, dpi=640, isGoogleDevice=false).code */
      val OP4BA2L1 = "spec:width=1440,height=3168,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=OPPO, code=OP4BA5L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4BA5L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4BA5L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4BAFL1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4BAFL1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4BAFL1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4BDCL1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4BDCL1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4BDCL1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4BFB, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4BFB, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val OP4BFB = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP4C2DL1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4C2DL1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4C2DL1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4C41L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4C41L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4C41L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4C45L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4C45L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4C45L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4C4BL1, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4C4BL1, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val OP4C4BL1 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4C51L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4C51L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4C51L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4C5FL1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4C5FL1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4C5FL1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4C72L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4C72L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4C72L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4C77L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4C77L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4C77L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4C7BL1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4C7BL1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4C7BL1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4C7D, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4C7D, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val OP4C7D = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP4C87L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4C87L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4C87L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4E21, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4E21, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4E21 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4E2F, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4E2F, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val OP4E2F = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP4E35, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4E35, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val OP4E35 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP4E3F, width=1440, height=3216, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4E3F, width=1440,
      height=3216, dpi=480, isGoogleDevice=false).code */
      val OP4E3F = "spec:width=1440,height=3216,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4E49, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4E49, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4E49 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4E59, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4E59, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4E59 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4E5D, width=1440, height=3216, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4E5D, width=1440,
      height=3216, dpi=480, isGoogleDevice=false).code */
      val OP4E5D = "spec:width=1440,height=3216,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4E6B, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4E6B, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4E6B = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4E75L1, width=1792, height=1920, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4E75L1, width=1792,
      height=1920, dpi=440, isGoogleDevice=false).code */
      val OP4E75L1 = "spec:width=1792,height=1920,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=OPPO, code=OP4E7B, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4E7B, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val OP4E7B = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP4E7F, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4E7F, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4E7F = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4E8C, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4E8C, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val OP4E8C = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP4E8F, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4E8F, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4E8F = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4E9F, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4E9F, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4E9F = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4EA3, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4EA3, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4EA3 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4EA7, width=1080, height=2388, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4EA7, width=1080,
      height=2388, dpi=480, isGoogleDevice=false).code */
      val OP4EA7 = "spec:width=1080,height=2388,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4EB7, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4EB7, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4EB7 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4EC1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4EC1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4EC1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4ECB, width=1080, height=2388, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4ECB, width=1080,
      height=2388, dpi=480, isGoogleDevice=false).code */
      val OP4ECB = "spec:width=1080,height=2388,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4ED5, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4ED5, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4ED5 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4EE8L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4EE8L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4EE8L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4EEA, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4EEA, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val OP4EEA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP4EF3L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4EF3L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4EF3L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4EFDL1, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4EFDL1, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val OP4EFDL1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP4F0BL1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4F0BL1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4F0BL1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4F11L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4F11L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4F11L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4F1BL1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4F1BL1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4F1BL1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4F1FL1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4F1FL1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4F1FL1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4F25L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4F25L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4F25L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4F2BL1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4F2BL1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4F2BL1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4F2F, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4F2F, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val OP4F2F = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP4F39L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4F39L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4F39L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4F43L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4F43L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4F43L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4F4DL1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4F4DL1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4F4DL1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4F53L1, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4F53L1, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val OP4F53L1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP4F57L1, width=1440, height=3216, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4F57L1, width=1440,
      height=3216, dpi=480, isGoogleDevice=false).code */
      val OP4F57L1 = "spec:width=1440,height=3216,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4F7FL1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4F7FL1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4F7FL1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4F81L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4F81L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4F81L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4F83L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4F83L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4F83L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP4F97, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4F97, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val OP4F97 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP4FA7L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP4FA7L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP4FA7L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP520DL1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP520DL1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP520DL1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP520F, width=1440, height=3216, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP520F, width=1440,
      height=3216, dpi=480, isGoogleDevice=false).code */
      val OP520F = "spec:width=1440,height=3216,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5217, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5217, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP5217 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5223, width=1600, height=2560, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5223, width=1600,
      height=2560, dpi=360, isGoogleDevice=false).code */
      val OP5223 = "spec:width=1600,height=2560,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=OPPO, code=OP5225, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5225, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val OP5225 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=OPPO, code=OP5226L1, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5226L1, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val OP5226L1 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=OPPO, code=OP5227, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5227, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP5227 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5231, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5231, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP5231 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5245, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5245, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP5245 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5259, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5259, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP5259 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5267, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5267, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP5267 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP526D, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP526D, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val OP526D = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP5281, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5281, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP5281 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5285, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5285, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP5285 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5287, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5287, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP5287 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP528BL1, width=1440, height=3216, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP528BL1, width=1440,
      height=3216, dpi=480, isGoogleDevice=false).code */
      val OP528BL1 = "spec:width=1440,height=3216,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP528F, width=1240, height=2772, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP528F, width=1240,
      height=2772, dpi=560, isGoogleDevice=false).code */
      val OP528F = "spec:width=1240,height=2772,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OPPO, code=OP5295, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5295, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP5295 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5297, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5297, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP5297 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP52D1L1, width=1440, height=3216, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP52D1L1, width=1440,
      height=3216, dpi=480, isGoogleDevice=false).code */
      val OP52D1L1 = "spec:width=1440,height=3216,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP52D5L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP52D5L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP52D5L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP52E1L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP52E1L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP52E1L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP52EBL1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP52EBL1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP52EBL1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP52F3L1, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP52F3L1, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val OP52F3L1 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP5303, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5303, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val OP5303 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP5321, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5321, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val OP5321 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP5325, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5325, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val OP5325 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP532BL1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP532BL1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP532BL1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP532FL1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP532FL1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP532FL1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5335L1, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5335L1, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP5335L1 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5339L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5339L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP5339L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP533FL1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP533FL1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP533FL1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5353L1, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5353L1, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val OP5353L1 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP5355, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5355, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val OP5355 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP55F3L1, width=2268, height=2440, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP55F3L1, width=2268,
      height=2440, dpi=520, isGoogleDevice=false).code */
      val OP55F3L1 = "spec:width=2268,height=2440,unit=px,dpi=520"

      /** DeviceSpec(manufacturer=OPPO, code=OP55FF, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP55FF, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP55FF = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5601, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5601, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP5601 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5605, width=1080, height=2520, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5605, width=1080,
      height=2520, dpi=480, isGoogleDevice=false).code */
      val OP5605 = "spec:width=1080,height=2520,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5607L1, width=1080, height=2520, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5607L1, width=1080,
      height=2520, dpi=480, isGoogleDevice=false).code */
      val OP5607L1 = "spec:width=1080,height=2520,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5613, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5613, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP5613 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP561D, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP561D, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP561D = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP561F, width=1240, height=2772, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP561F, width=1240,
      height=2772, dpi=560, isGoogleDevice=false).code */
      val OP561F = "spec:width=1240,height=2772,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OPPO, code=OP5627, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5627, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP5627 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5637L1, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5637L1, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val OP5637L1 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP5647, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5647, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP5647 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP564B, width=1240, height=2772, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP564B, width=1240,
      height=2772, dpi=560, isGoogleDevice=false).code */
      val OP564B = "spec:width=1240,height=2772,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OPPO, code=OP5655, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5655, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP5655 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP565FL1, width=1440, height=3216, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP565FL1, width=1440,
      height=3216, dpi=640, isGoogleDevice=false).code */
      val OP565FL1 = "spec:width=1440,height=3216,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=OPPO, code=OP5660L1, width=1440, height=3216, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5660L1, width=1440,
      height=3216, dpi=640, isGoogleDevice=false).code */
      val OP5660L1 = "spec:width=1440,height=3216,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=OPPO, code=OP5661L1, width=1264, height=2780, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5661L1, width=1264,
      height=2780, dpi=560, isGoogleDevice=false).code */
      val OP5661L1 = "spec:width=1264,height=2780,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OPPO, code=OP56BBL1, width=2268, height=2440, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP56BBL1, width=2268,
      height=2440, dpi=520, isGoogleDevice=false).code */
      val OP56BBL1 = "spec:width=2268,height=2440,unit=px,dpi=520"

      /** DeviceSpec(manufacturer=OPPO, code=OP56CDL1, width=1080, height=2520, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP56CDL1, width=1080,
      height=2520, dpi=480, isGoogleDevice=false).code */
      val OP56CDL1 = "spec:width=1080,height=2520,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP56CFL1, width=1080, height=2520, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP56CFL1, width=1080,
      height=2520, dpi=480, isGoogleDevice=false).code */
      val OP56CFL1 = "spec:width=1080,height=2520,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP56D3L1, width=1240, height=2772, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP56D3L1, width=1240,
      height=2772, dpi=560, isGoogleDevice=false).code */
      val OP56D3L1 = "spec:width=1240,height=2772,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OPPO, code=OP56DBL1, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP56DBL1, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP56DBL1 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP56E1L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP56E1L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP56E1L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP56E7L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP56E7L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP56E7L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP56E8L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP56E8L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP56E8L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP56EDL1, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP56EDL1, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP56EDL1 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP56F5, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP56F5, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val OP56F5 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP5701L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5701L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP5701L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5705L1, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5705L1, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP5705L1 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5709L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5709L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP5709L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP571DL1, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP571DL1, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val OP571DL1 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP571F, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP571F, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val OP571F = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP573DL1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP573DL1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP573DL1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5745L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5745L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP5745L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP574FL1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP574FL1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP574FL1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5759L1, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5759L1, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val OP5759L1 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP575DL1, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP575DL1, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val OP575DL1 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP591D, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP591D, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP591D = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5925, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5925, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP5925 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5989, width=2000, height=2800, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5989, width=2000,
      height=2800, dpi=400, isGoogleDevice=false).code */
      val OP5989 = "spec:width=2000,height=2800,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=OPPO, code=OP59BBL1, width=2000, height=2800, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP59BBL1, width=2000,
      height=2800, dpi=400, isGoogleDevice=false).code */
      val OP59BBL1 = "spec:width=2000,height=2800,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=OPPO, code=OP59EDL1, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP59EDL1, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP59EDL1 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP59EFL1, width=1240, height=2772, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP59EFL1, width=1240,
      height=2772, dpi=560, isGoogleDevice=false).code */
      val OP59EFL1 = "spec:width=1240,height=2772,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OPPO, code=OP59FB, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP59FB, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP59FB = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5A0BL1, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5A0BL1, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP5A0BL1 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5A0D, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5A0D, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val OP5A0D = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP5A15L1, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5A15L1, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP5A15L1 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5A1F, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5A1F, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP5A1F = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5A29L1, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5A29L1, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP5A29L1 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5A2BL1, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5A2BL1, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP5A2BL1 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5A3DL1, width=1256, height=2760, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5A3DL1, width=1256,
      height=2760, dpi=560, isGoogleDevice=false).code */
      val OP5A3DL1 = "spec:width=1256,height=2760,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OPPO, code=OP5A41L1, width=1264, height=2780, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5A41L1, width=1264,
      height=2780, dpi=560, isGoogleDevice=false).code */
      val OP5A41L1 = "spec:width=1264,height=2780,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OPPO, code=OP5A47, width=720, height=1604, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5A47, width=720,
      height=1604, dpi=320, isGoogleDevice=false).code */
      val OP5A47 = "spec:width=720,height=1604,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP5AA5L1, width=1256, height=2760, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5AA5L1, width=1256,
      height=2760, dpi=560, isGoogleDevice=false).code */
      val OP5AA5L1 = "spec:width=1256,height=2760,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OPPO, code=OP5AB0L1, width=1264, height=2780, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5AB0L1, width=1264,
      height=2780, dpi=560, isGoogleDevice=false).code */
      val OP5AB0L1 = "spec:width=1264,height=2780,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OPPO, code=OP5ABFL1, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5ABFL1, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP5ABFL1 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5AD3L1, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5AD3L1, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP5AD3L1 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5AD5L1, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5AD5L1, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val OP5AD5L1 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP5ADDL1, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5ADDL1, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP5ADDL1 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5AE1L1, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5AE1L1, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP5AE1L1 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5AE7L1, width=720, height=1604, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5AE7L1, width=720,
      height=1604, dpi=320, isGoogleDevice=false).code */
      val OP5AE7L1 = "spec:width=720,height=1604,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP5AF2L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5AF2L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP5AF2L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5B05L1, width=720, height=1604, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5B05L1, width=720,
      height=1604, dpi=320, isGoogleDevice=false).code */
      val OP5B05L1 = "spec:width=720,height=1604,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP5B16L1, width=720, height=1604, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5B16L1, width=720,
      height=1604, dpi=320, isGoogleDevice=false).code */
      val OP5B16L1 = "spec:width=720,height=1604,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP5B19L1, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5B19L1, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP5B19L1 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5D76L1, width=2120, height=3000, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5D76L1, width=2120,
      height=3000, dpi=420, isGoogleDevice=false).code */
      val OP5D76L1 = "spec:width=2120,height=3000,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=OPPO, code=OP5DA3L1, width=1720, height=2408, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5DA3L1, width=1720,
      height=2408, dpi=360, isGoogleDevice=false).code */
      val OP5DA3L1 = "spec:width=1720,height=2408,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=OPPO, code=OP5DA8L1, width=2120, height=3000, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5DA8L1, width=2120,
      height=3000, dpi=420, isGoogleDevice=false).code */
      val OP5DA8L1 = "spec:width=2120,height=3000,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=OPPO, code=OP5DC1L1, width=2248, height=2480, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5DC1L1, width=2248,
      height=2480, dpi=520, isGoogleDevice=false).code */
      val OP5DC1L1 = "spec:width=2248,height=2480,unit=px,dpi=520"

      /** DeviceSpec(manufacturer=OPPO, code=OP5DCBL1, width=1216, height=2640, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5DCBL1, width=1216,
      height=2640, dpi=560, isGoogleDevice=false).code */
      val OP5DCBL1 = "spec:width=1216,height=2640,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OPPO, code=OP5DCDL1, width=1256, height=2760, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5DCDL1, width=1256,
      height=2760, dpi=560, isGoogleDevice=false).code */
      val OP5DCDL1 = "spec:width=1256,height=2760,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OPPO, code=OP5DD2L1, width=1440, height=3216, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5DD2L1, width=1440,
      height=3216, dpi=640, isGoogleDevice=false).code */
      val OP5DD2L1 = "spec:width=1440,height=3216,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=OPPO, code=OP5DD3L1, width=1440, height=3216, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5DD3L1, width=1440,
      height=3216, dpi=640, isGoogleDevice=false).code */
      val OP5DD3L1 = "spec:width=1440,height=3216,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=OPPO, code=OP5DD5L1, width=1272, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5DD5L1, width=1272,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val OP5DD5L1 = "spec:width=1272,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OPPO, code=OP5DD7L1, width=1256, height=2760, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5DD7L1, width=1256,
      height=2760, dpi=560, isGoogleDevice=false).code */
      val OP5DD7L1 = "spec:width=1256,height=2760,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OPPO, code=OP5DDF, width=720, height=1604, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5DDF, width=720,
      height=1604, dpi=320, isGoogleDevice=false).code */
      val OP5DDF = "spec:width=720,height=1604,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP5DF3, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5DF3, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP5DF3 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5DF5L1, width=720, height=1604, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5DF5L1, width=720,
      height=1604, dpi=320, isGoogleDevice=false).code */
      val OP5DF5L1 = "spec:width=720,height=1604,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP5DF7, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5DF7, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP5DF7 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5DFDL1, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5DFDL1, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP5DFDL1 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5E01L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5E01L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP5E01L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5E03L1, width=1280, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5E03L1, width=1280,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val OP5E03L1 = "spec:width=1280,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OPPO, code=OP5E05L1, width=1280, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5E05L1, width=1280,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val OP5E05L1 = "spec:width=1280,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OPPO, code=OP5E07L1, width=1272, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5E07L1, width=1272,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val OP5E07L1 = "spec:width=1272,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OPPO, code=OP5E0BL1, width=1256, height=2760, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5E0BL1, width=1256,
      height=2760, dpi=560, isGoogleDevice=false).code */
      val OP5E0BL1 = "spec:width=1256,height=2760,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OPPO, code=OP5E89L1, width=2248, height=2480, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5E89L1, width=2248,
      height=2480, dpi=520, isGoogleDevice=false).code */
      val OP5E89L1 = "spec:width=2248,height=2480,unit=px,dpi=520"

      /** DeviceSpec(manufacturer=OPPO, code=OP5E9EL1, width=1256, height=2760, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5E9EL1, width=1256,
      height=2760, dpi=560, isGoogleDevice=false).code */
      val OP5E9EL1 = "spec:width=1256,height=2760,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OPPO, code=OP5EA7L1, width=720, height=1604, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5EA7L1, width=720,
      height=1604, dpi=320, isGoogleDevice=false).code */
      val OP5EA7L1 = "spec:width=720,height=1604,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP5EB1L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5EB1L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP5EB1L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5EBBL1, width=720, height=1604, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5EBBL1, width=720,
      height=1604, dpi=320, isGoogleDevice=false).code */
      val OP5EBBL1 = "spec:width=720,height=1604,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP5EC5L1, width=1272, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5EC5L1, width=1272,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val OP5EC5L1 = "spec:width=1272,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OPPO, code=OP5EC7L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5EC7L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP5EC7L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5ECBL1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5ECBL1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP5ECBL1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5ECFL1, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5ECFL1, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP5ECFL1 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5ED7L1, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5ED7L1, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP5ED7L1 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5ED9L1, width=720, height=1604, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5ED9L1, width=720,
      height=1604, dpi=320, isGoogleDevice=false).code */
      val OP5ED9L1 = "spec:width=720,height=1604,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP5EE3L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5EE3L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP5EE3L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP5EE7L1, width=1280, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5EE7L1, width=1280,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val OP5EE7L1 = "spec:width=1280,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OPPO, code=OP5EE9L1, width=1280, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5EE9L1, width=1280,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val OP5EE9L1 = "spec:width=1280,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OPPO, code=OP5EEDL1, width=720, height=1604, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5EEDL1, width=720,
      height=1604, dpi=320, isGoogleDevice=false).code */
      val OP5EEDL1 = "spec:width=720,height=1604,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP5EF7L1, width=720, height=1604, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5EF7L1, width=720,
      height=1604, dpi=320, isGoogleDevice=false).code */
      val OP5EF7L1 = "spec:width=720,height=1604,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OP5F02L1, width=1256, height=2760, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5F02L1, width=1256,
      height=2760, dpi=560, isGoogleDevice=false).code */
      val OP5F02L1 = "spec:width=1256,height=2760,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OPPO, code=OP5F05L1, width=1272, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5F05L1, width=1272,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val OP5F05L1 = "spec:width=1272,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OPPO, code=OP5F0FL1, width=1080, height=2372, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP5F0FL1, width=1080,
      height=2372, dpi=480, isGoogleDevice=false).code */
      val OP5F0FL1 = "spec:width=1080,height=2372,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OP6159L1, width=2000, height=2800, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP6159L1, width=2000,
      height=2800, dpi=400, isGoogleDevice=false).code */
      val OP6159L1 = "spec:width=2000,height=2800,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=OPPO, code=OP615CL1, width=2400, height=3392, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP615CL1, width=2400,
      height=3392, dpi=420, isGoogleDevice=false).code */
      val OP615CL1 = "spec:width=2400,height=3392,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=OPPO, code=OP6160L1, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP6160L1, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val OP6160L1 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=OPPO, code=OP618BL1, width=2000, height=2800, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP618BL1, width=2000,
      height=2800, dpi=400, isGoogleDevice=false).code */
      val OP618BL1 = "spec:width=2000,height=2800,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=OPPO, code=OP6192L1, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP6192L1, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val OP6192L1 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=OPPO, code=OP6193L1, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OP6193L1, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val OP6193L1 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=OPPO, code=OPD2A0, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OPD2A0, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OPD2A0 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=OPD4A1L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OPD4A1L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OPD4A1L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=orca, width=402, height=476, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=orca, width=402,
      height=476, dpi=320, isGoogleDevice=false).code */
      val ORCA = "spec:width=402,height=476,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OWWE231, width=466, height=466, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OWWE231, width=466,
      height=466, dpi=320, isGoogleDevice=false).code */
      val OWWE231 = "spec:width=466,height=466,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=OWWE242, width=466, height=466, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OWWE242, width=466,
      height=466, dpi=360, isGoogleDevice=false).code */
      val OWWE242 = "spec:width=466,height=466,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=OPPO, code=OWWE251, width=466, height=466, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=OWWE251, width=466,
      height=466, dpi=320, isGoogleDevice=false).code */
      val OWWE251 = "spec:width=466,height=466,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=PAAM00, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=PAAM00, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val PAAM00 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=PAAT00, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=PAAT00, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val PAAT00 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=PACM00, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=PACM00, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val PACM00 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=PACT00, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=PACT00, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val PACT00 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=PADM00, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=PADM00, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val PADM00 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=PADT00, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=PADT00, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val PADT00 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=PAFM00, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=PAFM00, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PAFM00 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=PAFT00, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=PAFT00, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PAFT00 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=PAHM00, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=PAHM00, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PAHM00 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=PBAM00, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=PBAM00, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val PBAM00 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=PBAT00, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=PBAT00, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val PBAT00 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=PBBM00, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=PBBM00, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PBBM00 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=PBBM30, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=PBBM30, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PBBM30 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=PBBT00, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=PBBT00, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PBBT00 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=PBBT30, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=PBBT30, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val PBBT30 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=PBCM10, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=PBCM10, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PBCM10 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=PBCM30, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=PBCM30, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PBCM30 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=PBCT10, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=PBCT10, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PBCT10 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=PBDM00, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=PBDM00, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PBDM00 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=PBDT00, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=PBDT00, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PBDT00 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=PBEM00, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=PBEM00, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PBEM00 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=PBET00, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=PBET00, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PBET00 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=PBFM00, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=PBFM00, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val PBFM00 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=PBFT00, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=PBFT00, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PBFT00 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=PCDT00, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=PCDT00, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val PCDT00 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=R1011, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R1011, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val R1011 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OPPO, code=R11, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R11, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val R11 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=R11Plus, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R11Plus, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val R11PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=R11Plusk, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R11Plusk, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val R11PLUSK = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=R11s, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R11s, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val R11S = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=R11sPlus, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R11sPlus, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val R11SPLUS = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=R2017, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R2017, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val R2017 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OPPO, code=R5, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R5, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val R5 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=R7, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R7, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val R7 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=R7007, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R7007, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val R7007 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=R7c, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R7c, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val R7C = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=R7f, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R7f, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val R7F = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=R7Plus, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R7Plus, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val R7PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=R7Plusm, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R7Plusm, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val R7PLUSM = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=R7s, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R7s, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val R7S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=R7sf, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R7sf, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val R7SF = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=R7sm, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R7sm, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val R7SM = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=R7sPlus, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R7sPlus, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val R7SPLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=R8001, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R8001, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val R8001 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=R8006, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R8006, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val R8006 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=R815, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R815, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val R815 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OPPO, code=R821, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R821, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val R821 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OPPO, code=R827, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R827, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val R827 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OPPO, code=R829, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R829, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val R829 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=R831, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R831, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val R831 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OPPO, code=R831L, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R831L, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val R831L = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OPPO, code=R9, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R9, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val R9 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=R9PlusA, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R9PlusA, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val R9PLUSA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=R9s, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R9s, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val R9S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=R9sk, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R9sk, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val R9SK = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=R9sPlus, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=R9sPlus, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val R9SPLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=RMX1801, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=RMX1801, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val RMX1801 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=RMX1803, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=RMX1803, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val RMX1803 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=RMX1805, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=RMX1805, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val RMX1805 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=RMX1807, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=RMX1807, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val RMX1807 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=RMX1809, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=RMX1809, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val RMX1809 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=RMX1811, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=RMX1811, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val RMX1811 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OPPO, code=X9006, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=X9006, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val X9006 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=X9007, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=X9007, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val X9007 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=X9009, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=X9009, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val X9009 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=X9076, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=X9076, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val X9076 = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=OPPO, code=X9079, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=X9079, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val X9079 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=X909, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=X909, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val X909 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=X909T, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=X909T, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val X909T = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OPPO, code=1201, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=1201, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val _1201 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OPPO, code=1206, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OPPO, code=1206, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val _1206 = "spec:width=480,height=854,unit=px,dpi=240"

  }
